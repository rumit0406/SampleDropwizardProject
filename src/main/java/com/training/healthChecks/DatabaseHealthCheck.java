//package com.training.healthChecks;
//
//import io.dropwizard.db.DataSourceFactory;
//import io.dropwizard.hibernate.HibernateBundle;
//import com.codahale.metrics.health.HealthCheck;
//
//public class DatabaseHealthCheck extends HealthCheck {
//    private final Database database;
//
//    public DatabaseHealthCheck(Database database) {
//        this.database = database;
//    }
//
//    @Override
//    protected Result check() throws Exception {
//        if (database.isConnected()) {
//            return Result.healthy();
//        } else {
//            return Result.unhealthy("Cannot connect to " + database.getUrl());
//        }
//    }
//}
