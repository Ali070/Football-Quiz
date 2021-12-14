package com.alisamir.footballquiz.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.data.CONSTANTS
import com.alisamir.footballquiz.databinding.FragmentQuestionsBinding
import com.alisamir.footballquiz.pojo.BadgeQuestion
import com.alisamir.footballquiz.pojo.InfoQuestion
import com.alisamir.footballquiz.pojo.PlayerPhotoQuestion
import kotlin.random.Random

class QuestionsFragment : Fragment() {
    lateinit var binding: FragmentQuestionsBinding
    var level:Int = 0
    var questionsNumber = 0
    var score:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val args = QuestionsFragmentArgs.fromBundle(it)
            level = args.level
            questionsNumber = args.questions
        }
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar?.show()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        level = 0
        questionsNumber = 0
        score = 0
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuestionsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBar.max = questionsNumber
        if(level==1 || level==2){
            binding.textQuestion.visibility = View.GONE
            binding.cardQuestion.visibility = View.VISIBLE
            if (level==1){
                var questionOrder = 0
                val questions = ArrayList<PlayerPhotoQuestion>()
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level1List.get(i))
                }
                setLevel1Question(questions.get(questionOrder),questionOrder)
                binding.subBtn.setOnClickListener {
                    if(questionOrder==questionsNumber-1){
                        binding.goToNextBtn.visibility = View.GONE
                        binding.subBtn.visibility = View.GONE
                        binding.goToScoreBtn.visibility = View.VISIBLE
                    }else{
                        binding.goToNextBtn.visibility = View.VISIBLE
                        binding.subBtn.visibility = View.GONE
                    }

                  binding.questionRadioGroup.isEnabled = false
                  val checkedId = binding.questionRadioGroup.checkedRadioButtonId
                  val rightID = questions.get(questionOrder).rightAnswer
                  checkAnswer(checkedId,rightID,it.context)
                }
                binding.goToNextBtn.setOnClickListener {
                    questionOrder++
                    setLevel1Question(questions.get(questionOrder),questionOrder)
                }
                binding.goToScoreBtn.setOnClickListener {
                    checkScore(score,questionsNumber)
                }

            }else if (level==2){
                var questionOrder = 0
                val questions = ArrayList<BadgeQuestion>()
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level2List.get(i))
                }
                setLevel2Question(questions.get(questionOrder),questionOrder)
                binding.subBtn.setOnClickListener {
                    if(questionOrder==questionsNumber-1){
                        binding.goToNextBtn.visibility = View.GONE
                        binding.subBtn.visibility = View.GONE
                        binding.goToScoreBtn.visibility = View.VISIBLE
                    }else{
                        binding.goToNextBtn.visibility = View.VISIBLE
                        binding.subBtn.visibility = View.GONE
                    }

                    binding.questionRadioGroup.isEnabled = false
                    val checkedId = binding.questionRadioGroup.checkedRadioButtonId
                    val rightID = questions.get(questionOrder).rightAnswer
                    checkAnswer(checkedId,rightID,it.context)
                }
                binding.goToNextBtn.setOnClickListener {
                    questionOrder++
                    setLevel2Question(questions.get(questionOrder),questionOrder)
                }
                binding.goToScoreBtn.setOnClickListener {
                    checkScore(score,questionsNumber)
                }
            }
        }else if(level==3 || level==4 || level==5 || level==6){
            binding.textQuestion.visibility = View.VISIBLE
            binding.cardQuestion.visibility = View.GONE
            var questionOrder = 0
            val questions = ArrayList<InfoQuestion>()
            if (level==3){
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level3List.get(i))
                }
            }else if(level==4){
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level4List.get(i))
                }
            }else if(level==5){
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level5List.get(i))
                }
            }else if(level==6){
                for (i in 0 until questionsNumber){
                    questions.add(CONSTANTS.level6List.get(i))
                }
            }
            setInfoQuestion(questions.get(questionOrder),questionOrder)
            binding.subBtn.setOnClickListener {
                if(questionOrder==questionsNumber-1){
                    binding.goToNextBtn.visibility = View.GONE
                    binding.subBtn.visibility = View.GONE
                    binding.goToScoreBtn.visibility = View.VISIBLE
                }else{
                    binding.goToNextBtn.visibility = View.VISIBLE
                    binding.subBtn.visibility = View.GONE
                }

                binding.questionRadioGroup.isEnabled = false
                val checkedId = binding.questionRadioGroup.checkedRadioButtonId
                val rightID = questions.get(questionOrder).rightAnswer
                checkAnswer(checkedId,rightID,it.context)
            }
            binding.goToNextBtn.setOnClickListener {
                questionOrder++
                setInfoQuestion(questions.get(questionOrder),questionOrder)
            }
            binding.goToScoreBtn.setOnClickListener {
                checkScore(score,questionsNumber)
            }
        }
    }
    fun checkScore(score:Int , number:Int){
        val result = score.toDouble()/number.toDouble()
        if (result>=0.5) {
            val action = QuestionsFragmentDirections.actionQuestionsFragment3ToResultFragment(1)
            findNavController().navigate(action)
        }else {
            val action = QuestionsFragmentDirections.actionQuestionsFragment3ToResultFragment(0)
            findNavController().navigate(action)
        }
    }
    fun setLevel1Question(playerPhotoQuestion: PlayerPhotoQuestion, order:Int){
        val progress = order + 1
        binding.answer1.setBackgroundResource(R.drawable.answer_back)
        binding.answer2.setBackgroundResource(R.drawable.answer_back)
        binding.answer3.setBackgroundResource(R.drawable.answer_back)
        binding.answer4.setBackgroundResource(R.drawable.answer_back)
        binding.answer1.text = playerPhotoQuestion.answer1
        binding.answer2.text = playerPhotoQuestion.answer2
        binding.answer3.text = playerPhotoQuestion.answer3
        binding.answer4.text = playerPhotoQuestion.answer4
        binding.questionImageIv.setImageResource(playerPhotoQuestion.photoQuestion)
        binding.subBtn.visibility = View.VISIBLE
        binding.goToNextBtn.visibility = View.GONE
        binding.scoreTv.text = "$score / $questionsNumber"
        binding.progressBar.progress = progress

    }
    fun setLevel2Question(badgeQuestion: BadgeQuestion,order:Int){
        val progress = order + 1
        binding.answer1.setBackgroundResource(R.drawable.answer_back)
        binding.answer2.setBackgroundResource(R.drawable.answer_back)
        binding.answer3.setBackgroundResource(R.drawable.answer_back)
        binding.answer4.setBackgroundResource(R.drawable.answer_back)
        binding.answer1.text = badgeQuestion.answer1
        binding.answer2.text = badgeQuestion.answer2
        binding.answer3.text = badgeQuestion.answer3
        binding.answer4.text = badgeQuestion.answer4
        binding.questionImageIv.setImageResource(badgeQuestion.badgeQuestion)
        binding.subBtn.visibility = View.VISIBLE
        binding.goToNextBtn.visibility = View.GONE
        binding.scoreTv.text = "$score / $questionsNumber"
        binding.progressBar.progress = progress
    }

    fun setInfoQuestion(infoQuestion: InfoQuestion,order:Int){
        val progress = order + 1
        binding.answer1.setBackgroundResource(R.drawable.answer_back)
        binding.answer2.setBackgroundResource(R.drawable.answer_back)
        binding.answer3.setBackgroundResource(R.drawable.answer_back)
        binding.answer4.setBackgroundResource(R.drawable.answer_back)
        binding.answer1.text = infoQuestion.answer1
        binding.answer2.text = infoQuestion.answer2
        binding.answer3.text = infoQuestion.answer3
        binding.answer4.text = infoQuestion.answer4
        binding.textQuestion.text = infoQuestion.Info
        binding.subBtn.visibility = View.VISIBLE
        binding.goToNextBtn.visibility = View.GONE
        binding.scoreTv.text = "$score / $questionsNumber"
        binding.progressBar.progress = progress
    }
    fun checkAnswer(checkedID:Int , rightID:Int, context: Context){
        if(checkedID == rightID){
            val rightButton = binding.root.findViewById<RadioButton>(checkedID)
            rightButton.background = ContextCompat.getDrawable(context,R.drawable.right_answer)
            score++
        }else{
            val wrongButton = binding.root.findViewById<RadioButton>(checkedID)
            wrongButton.background = ContextCompat.getDrawable(context,R.drawable.wrong_answer)
            val rightButton = binding.root.findViewById<RadioButton>(rightID)
            rightButton.background = ContextCompat.getDrawable(context,R.drawable.right_answer)
        }
    }




}