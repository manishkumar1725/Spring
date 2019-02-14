package com.manish.q2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class QuestionSet {
	
	int questionId;
	String question;
	Set<String> answers;
	
	public QuestionSet(int questionId, String question, Set<String> answers) 
	{
        this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	//GETTERS AND SETTERS..
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	
	public void displaySet()
	{
		System.out.println(questionId+"--"+question);
		System.out.println("ANSWER ARE:");
		
        Iterator<String> itr=answers.iterator();
	    
	    while(itr.hasNext())
	    {  
	        System.out.println(itr.next());  
	    }  
	    System.out.println("-----------------------");
	}
	
	
	
	

}
