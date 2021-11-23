

plugins {
    kotlin("jvm") version "1.6.0"
    kotlin("kapt") version "1.6.0"
    java
}

group = "me.conclure.midway"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.kryptonmc.org/releases")
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    compileOnly("org.kryptonmc:krypton-api:+")
    kapt("org.kryptonmc", "krypton-annotation-processor", "+") // Kotlin only
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs = listOf("-Xjvm-default=enable")
    }
}
