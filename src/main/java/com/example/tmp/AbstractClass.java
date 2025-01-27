package com.example.tmp;

public abstract class AbstractClass {
    // Template method
    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void stepOne();
    protected abstract void stepTwo();
    protected abstract void stepThree();
}