
/// Dependencies
// Looking for dependencies? see gradle/libs.versions.toml file.
// Also see Gradle Version Catalog(https://docs.gradle.org/7.1.1/userguide/platforms.html#sub:central-declaration-of-dependencies).
enableFeaturePreview("VERSION_CATALOGS")


pluginManagement.resolutionStrategy.eachPlugin {
	val id = requested.id.id
	
	// Android
	if(id.startsWith("com.android")) {
		useModule("com.android.tools.build:gradle:4.2.0")
	}
}

fun includeAll(filePath: String, path: String, vararg items: String) {
	for(item in items) {
		val realPath = "$filePath/$item"
		val projectPath = "$path:$item"
		include(projectPath)
		
		project(projectPath).projectDir = file(realPath)
	}
}


/// Projects
includeBuild("includeBuild")

includeAll(
	filePath = "modules",
	path = "",
	"core"
)

