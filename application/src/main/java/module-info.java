module application {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.beans;

    opens com.swayambhu.application to spring.core, spring.context, spring.beans;
}