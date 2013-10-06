package com.jayway.dejavu.circuitbreaker.impl;

import com.jayway.dejavu.core.ThreadThrowable;
import com.jayway.dejavu.core.Trace;
import com.jayway.dejavu.core.repository.TraceCallback;

import java.util.List;

public class TraceCallbackImpl implements TraceCallback {

    private Trace trace;
    private Throwable cause;
    private List<ThreadThrowable> threadCauses;

    @Override
    public void traced(Trace trace, Throwable cause, List<ThreadThrowable> threadCauses ) {
        this.trace = trace;
        this.cause = cause;
        this.threadCauses = threadCauses;
    }

    public Throwable getCause() {
        return cause;
    }

    public Trace getTrace() {
        return trace;
    }
}
