package com.manish.q2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	
	int questionId;
	String question;
	Map<Integer,String> answers;
	
	public QuestionMap(int questionId, String question,Map<Integer, String> answers) 
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

	public Map<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	
	
	public void displayMap()
	{
		System.out.println(questionId+"--"+question);
		
		System.out.println("ANSWER ARE:");
		
		Set<Entry<Integer,String>> set = answers.entrySet();
		
		 Iterator<Entry<Integer, String>> itr=set.iterator();
		    
		    while(itr.hasNext())
		    {  
		        System.out.println(itr.next());  
		    }  
	}
	
	
	


}
