// Define dependency versions
ext {
    appCompatVersion = "1.4.1"
    materialVersion = "1.5.0-alpha01"
    backpackVersion = "43.0.0"
}

// Use the defined versions for dependencies
dependencies {
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("com.google.android.material:material:$materialVersion")
    implementation("net.skyscanner.backpack:backpack-android:$backpackVersion")
}
