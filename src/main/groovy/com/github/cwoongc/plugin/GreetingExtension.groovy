package com.github.cwoongc.plugin

// GreetingPlugin의 설정수단으로 쓰일 greeting 익스텐션 클래스 타입
class GreetingExtension {
    private String greeting
    private String target

    public String getGreeting() {return this.greeting}
    public String getTarget() {return this.target}

    public void setGreeting(String greeting) {this.greeting = greeting}
    public void setTarget(String target) {this.target = target}

    void message(greeting, target) {
        this.greeting = greeting
        this.target = target
    }
}