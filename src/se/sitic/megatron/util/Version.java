/*
 * Copyright (c) 2009 SITIC (Sveriges IT-incidentcentrum). All rights reserved.
 */

package se.sitic.megatron.util;


/**
 * Returns application version and other build variables.
 * <p> 
 * This class is created from "Version.template" by an Ant script. 
 */
public class Version {
    private final static String APP_NAME = "Megatron";
    private final static String APP_VERSION = "1.0.10";
    private final static String APP_TAG = "none";
    private final static String BUILD_DATE = "2012-02-28 09:44:05";
    private final static String ANT_VERSION = "Apache Ant version 1.7.1 compiled on June 27 2008";
    private final static String ANT_JAVA_VERSION = "1.5";


    public static String getJavaVersion() {
        return System.getProperty("java.version", "[n/a]");
    }


    public static String getJavaClassPath() {
        return System.getProperty("java.class.path", "[n/a]");
    }


    public static String getAppName() {
        return APP_NAME;
    }


    public static String getAppVersion() {
        return APP_VERSION;
    }


    public static String getAppTag() {
        return APP_TAG;
    }
    
    
    public static String getBuildDate() {
        return BUILD_DATE;
    } 
    
    
    public static String getAntVersion() {
        return ANT_VERSION;
    } 


    public static String getAntJavaVersion() {
        return ANT_JAVA_VERSION;
    } 
    
    
    /**
     * Returns application name + version. 
     */
    public static String getVersion(boolean includeBuildDate) {
        StringBuilder result = new StringBuilder(120);
        
        result.append(APP_NAME).append(" ").append(APP_VERSION);
        if (includeBuildDate) {
            result.append(" (").append(BUILD_DATE).append(")");
        }
        
        return result.toString();
    }
    
    
    /**
     * Returns all attributes in this class formatted, e.g. version, 
     * build date etc.
     */
    public static String getVersionInfo() {
        StringBuilder result = new StringBuilder(1024); 
        
        final String newLine = System.getProperty("line.separator", "\r\n");
        result.append(getVersion(true)).append(newLine);
        result.append("  Tag: ").append(APP_TAG).append(newLine);
        result.append("  Java Version: ").append(getJavaVersion()).append(newLine);
        result.append("  Classpath: ").append(getJavaClassPath()).append(newLine);
        result.append("  Ant Version: ").append(ANT_VERSION).append(newLine);
        result.append("  Ant Java Version: ").append(ANT_JAVA_VERSION).append(newLine);
        
        return result.toString();
    }
    
}
