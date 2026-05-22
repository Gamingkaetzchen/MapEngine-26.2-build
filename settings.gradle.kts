rootProject.name = "MapEngine"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include("plugin", "api")

include(
        "platform-common",
        "platform-paper-1.20",
        "platform-paper-1.20.2",
        "platform-paper-1.20.3",
        "platform-paper-1.20.5",
        "platform-paper-1.21.2",
        "platform-paper-1.21.6",
        "platform-paper-1.21.11",
        "platform-paper-26.1"
)
