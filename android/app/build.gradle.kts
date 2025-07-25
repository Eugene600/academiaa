plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "io.opencrafts.academia"
    compileSdk = 35
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "io.opencrafts.academia"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = 28
        targetSdk = 35
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    flavorDimensions += "environment"

    productFlavors {
        create("development") {
            dimension = "environment"
            applicationIdSuffix = ".dev" // Appears as io.opencrafts.academia.dev
            versionNameSuffix = "-dev"   // Appears as 1.0.0-dev
            // You can add buildConfigField or resValue here for specific configurations
            // buildConfigField "String", "API_BASE_URL", "\"https://dev.api.example.com\""
        }
        create("production") {
            dimension = "environment"
            // No suffix needed if this is your primary application ID
            // buildConfigField "String", "API_BASE_URL", "\"https://prod.api.example.com\""
        }
        // You can add more flavors, e.g., a "staging" flavor
        
        create("staging") {
            dimension = "environment"
            applicationIdSuffix = ".stg"
            versionNameSuffix = "-stg"
            // buildConfigField "String", "API_BASE_URL", "\"https://stg.api.example.com\""
        } 
    }
}

flutter {
    source = "../.."
}
