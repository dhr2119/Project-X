package com.glow;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ProjectXApplication extends Application<ProjectXConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ProjectXApplication().run(args);
    }

    @Override
    public String getName() {
        return "ProjectX";
    }

    @Override
    public void initialize(final Bootstrap<ProjectXConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ProjectXConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
