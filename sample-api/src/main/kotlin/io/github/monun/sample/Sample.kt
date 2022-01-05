package io.github.monun.sample

interface Sample {
    companion object: Sample by LibraryLoader.loadNMS(Sample::class.java)

    val version: String
}