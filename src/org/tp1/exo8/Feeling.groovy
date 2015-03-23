package org.tp1.exo8

/**
 * Created by raclet on 15/03/2015.
 */
public enum Feeling {
    Happy, Sad, Neutral, Suicidal, Anticipation, Surprised, Relaxed, Guilty

    // ------------ START EDITING HERE ----------------------
    boolean isCase(Cartoon c) {
        switch (c.feeling) {
            case Guilty:
                return true
            default:
                return false
        }
    }

    boolean isCase(Person p) {
        boolean b = true
        p.feelings.each { it ->
            switch (it) {
                case Anticipation:
                    break
                case Happy:
                    break
                case Sad:
                    break
                case Suicidal:
                    break
                default:
                    b = false
                    break
            }
        }
        return true
    }
    // ------------ STOP EDITING HERE  ----------------------


}