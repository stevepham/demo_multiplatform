object Deps {
    object App {
        const val Id = "com.ht117.demomp"
        const val compileSdk = 29
        const val buildTool = "29.0.3"
        const val versionCode = 1
        const val versionName = "1.0"
        const val minSdk = 23
        const val targetSdk = 29
        const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    val AppPlugins = listOf(
        "com.android.application",
        "kotlin-android",
        "kotlin-android-extensions"
    )

    val Classpaths = listOf(
        "com.android.tools.build:gradle:4.0.1",
        "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72"
    )

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.3.0"
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Kt {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:1.3.72"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8"
    }

    object Test {
        const val junit = "junit:junit:4.13"
        const val jext = "androidx.test.ext:junit:1.1.1"
        const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }
}