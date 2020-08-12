plugins {
    for (plugin in Deps.AppPlugins) {
        id(plugin)
    }
}

android {
    compileSdkVersion(Deps.App.compileSdk)
    buildToolsVersion(Deps.App.buildTool)

    defaultConfig {
        applicationId = Deps.App.Id
        minSdkVersion(Deps.App.minSdk)
        targetSdkVersion(Deps.App.targetSdk)
        versionCode = Deps.App.versionCode
        versionName = Deps.App.versionName

        testInstrumentationRunner = Deps.App.testRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packagingOptions {
        exclude("META-INF/*.kotlin_module")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.Kt.stdLib)

    implementation(Deps.AndroidX.core)
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.constraint)

    implementation(Deps.Kt.coroutine)

    implementation(project(":base"))

    testImplementation(Deps.Test.junit)
    androidTestImplementation(Deps.Test.jext)
    androidTestImplementation(Deps.Test.espresso)

}