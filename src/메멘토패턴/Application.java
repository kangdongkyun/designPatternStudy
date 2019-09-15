package 메멘토패턴;

import 메멘토패턴.abc.Memento;
import 메멘토패턴.abc.Originator;

import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();
        Originator originator = new Originator();
        originator.setState("state 1");
        mementos.push(originator.createMemento());
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        originator.setState("state 3");
        mementos.push(originator.createMemento());
        originator.setState("final");
        mementos.push(originator.createMemento());

        originator.restoreMemeto(mementos.pop());
        System.out.println(originator.getState());

        originator.restoreMemeto(mementos.pop());
        System.out.println(originator.getState());

        originator.restoreMemeto(mementos.pop());
        System.out.println(originator.getState());

        originator.restoreMemeto(mementos.pop());
        System.out.println(originator.getState());
    }
}
