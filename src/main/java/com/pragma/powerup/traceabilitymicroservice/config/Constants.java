package com.pragma.powerup.traceabilitymicroservice.config;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String ORDER_NOT_FOUND_BY_ORDER_ID_MESSAGE = "order not found with the provided id";
    public static final String TRACEABILITY_ADDED_MESSAGE = "traceability added successfully";
    public static final String SWAGGER_TITLE_MESSAGE = "Traceability API Pragma Power Up";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "User microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "1.0.0";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "https://springdoc.org";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "https://swagger.io/terms/";
}
