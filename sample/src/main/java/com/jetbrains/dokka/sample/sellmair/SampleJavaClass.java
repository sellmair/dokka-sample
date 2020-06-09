package com.jetbrains.dokka.sample.sellmair;

/**
 * This is a sample Java class.
 * Unlike {@link com.jetbrains.dokka.sample.sellmair.SampleKotlinClass}, this class is written in java
 */
public abstract class SampleJavaClass {
    final int x = 1;
}

class X extends SampleJavaClass {
    public int x = 1;
}

interface Y {
    void x();
}