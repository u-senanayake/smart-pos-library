# Smart POS Library

This repository contains common libraries for the POS system.

## GitHub Actions Workflow

This project uses GitHub Actions to automatically:

1. Increment the version number
2. Build the project
3. Deploy to GitHub Packages

### How it works

When you push changes to the `main` branch, the following happens automatically:

1. The GitHub Actions workflow is triggered
2. The patch version in `pom.xml` is incremented (e.g., 0.0.1 → 0.0.2)
3. The updated version is committed back to the repository
4. The project is built with Maven
5. The built package is published to GitHub Packages

### Using the library in other projects

To use this library in another project, add the following to your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>lk.udcreations</groupId>
        <artifactId>smart-pos-library</artifactId>
        <version>0.0.1</version> <!-- Use the latest version -->
    </dependency>
</dependencies>

<repositories>
    <repository>
        <id>github</id>
        <name>GitHub UDCreations Apache Maven Packages</name>
        <url>https://maven.pkg.github.com/u-senanayake/smart-pos-library</url>
    </repository>
</repositories>
```

You'll also need to authenticate with GitHub Packages. Create or update your `~/.m2/settings.xml` file:

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

Replace `YOUR_GITHUB_TOKEN` with a GitHub Personal Access Token that has the `read:packages` scope.