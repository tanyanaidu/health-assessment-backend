package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assessments")
public class Assessment {

    @Id
    private String id;

    private String name;
    private String age;
    private String address;
    private String comorbidity;
    private String contact;

    private List<Integer> nimhansAnswers;
    private List<Integer> mdsAnswers;

    private String result;

    // GETTERS & SETTERS

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getComorbidity() { return comorbidity; }
    public void setComorbidity(String comorbidity) { this.comorbidity = comorbidity; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public List<Integer> getNimhansAnswers() { return nimhansAnswers; }
    public void setNimhansAnswers(List<Integer> nimhansAnswers) { this.nimhansAnswers = nimhansAnswers; }

    public List<Integer> getMdsAnswers() { return mdsAnswers; }
    public void setMdsAnswers(List<Integer> mdsAnswers) { this.mdsAnswers = mdsAnswers; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}