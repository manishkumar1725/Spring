package com.manish.q2;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	int questionId;
	String question;
	List<String> answers;
	
	
	public Question(int questionId, String question, List<String> answers) 
	{
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

    //GETTERS..
	public int getQuestionId() {
		return questionId;
	}


	public String getQuestion() {
		return question;
	}


	public List<String> getAnswers() {
		return answers;
	}

	//SETTERS..
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

  
	public void display(){  
	    System.out.println(questionId+"---"+question);  
	    System.out.println("ANSWER ARE:");
	    
	    Iterator<String> itr=answers.iterator();
	    
	    while(itr.hasNext())
	    {  
	        System.out.println(itr.next());  
	    }  
	    
	    System.out.println("-----------------------");
	} 
	
	
	

}
