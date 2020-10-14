# AnotherJavaProject -- Artifactory Consumer

## Step 1 -- Create ~/.gradle/gradle.properties, containing
* URL of your artifactory cloud repository
* Artifactory username
* Artifactory password

## Step 2 -- make your build.gradle look like the one in this project.

Dependencies should sync automatically.

## Step 3 -- Build and test

Happy Java-ing!

# Sample Client build.gradle

plugins {
    id 'java'
    id 'com.jfrog.artifactory' version '4.17.2'
}

group 'com.michaelwilliamjones'
version '1.0-SNAPSHOT'

sourceCompatibility = 1.8

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    //Check for the latest version here: http://plugins.gradle.org/plugin/com.jfrog.artifactory
    compile group: 'com.michaelwilliamjones', name: 'HelloJava', version: '1.2-SNAPSHOT'
}

artifactory {
    contextUrl = "${artifactory_contextUrl}"   //The base Artifactory URL if not overridden by the publisher/resolver
    resolve {
        repository {
            repoKey = 'gradle-dev'
            username = "${artifactory_user}"
            password = "${artifactory_password}"
            maven = true
        }
    }
}
