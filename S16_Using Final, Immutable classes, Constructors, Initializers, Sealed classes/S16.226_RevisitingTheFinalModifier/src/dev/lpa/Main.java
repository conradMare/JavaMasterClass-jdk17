package dev.lpa;

import consumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(45));
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(45));
        child.recommendedMethod();

        System.out.println("-".repeat(45));
        parent.recommendedStatic();
        System.out.println("-".repeat(45));
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(45));
        child.recommendedStatic();
    }
}
