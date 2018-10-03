plugins {
    id("org.jetbrains.kotlin.konan").version("0.8.2")
}

konanArtifacts {
    interop("add") {
        defFile("src/main/c_interop/add.def")
        compilerOpts("-Isrc/main/c")
    }


    program("HelloWorld") {
        libraries {
            artifact("add")
        }
    }
}
