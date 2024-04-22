package com.oocode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
    @Test
    public void canAnswerMyName() {
        var name = new Answerer().answerFor("What is your name?");
        var birth = new Answerer().answerFor("When were you born?");
        var born = new Answerer().answerFor("Where did you born?");
        var nationality = new Answerer().answerFor("What is your nationality?");
        var citizeniship = new Answerer().answerFor("What is your citizenship?");

        assertThat(name, equalTo("Kader"));
        assertThat(birth, equalTo("1994"));
        assertThat(born, equalTo("Turkey"));
        assertThat(nationality, equalTo("Turkey"));
        assertThat(citizeniship, equalTo("British"));
    }
}