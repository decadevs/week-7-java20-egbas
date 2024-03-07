package org.example;

import service.impl.HTTPServiceimpl;

import static commons.SimpleHTTPServer.PORT;

public class Main {
    public static void main(String[] args) {
        HTTPServiceimpl service = new HTTPServiceimpl();

        service.start(PORT);
    }
}