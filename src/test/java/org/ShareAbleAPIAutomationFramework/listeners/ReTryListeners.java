package org.ShareAbleAPIAutomationFramework.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.yaml.snakeyaml.constructor.Construct;

import java.lang.reflect.Method;

public class ReTryListeners implements IAnnotationTransformer {

    public void transform(ITestAnnotation iTestAnnotation, Class testClass, Construct testConstructor, Method testMethod){

        iTestAnnotation.setRetryAnalyzer(ReTryAnalyzer.class);
    }
}
