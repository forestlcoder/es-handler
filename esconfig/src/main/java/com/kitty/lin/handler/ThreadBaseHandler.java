package com.kitty.lin.handler;

/**
 * @auther: luolin
 * @email: ll950129@gmail.com
 * create at 2019-01-13
 */
public abstract class ThreadBaseHandler implements Handler {

    protected abstract void beforeHandle();

    public void handle() {

    }
}
