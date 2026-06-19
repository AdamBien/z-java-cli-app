# AGENTS.md

Zero-dependency Java 25 CLI app, built with [zb](https://github.com/AdamBien/zb) (no Maven/Gradle).

- **Build:** `zb.sh` → `zbo/app.jar` (also runs tests)
- **Start:** `java -jar zbo/app.jar`
- **Test:** `zunit`

Layout: sources in `src/main/java/airhacks/` (`App.java` is the entry point), resources in `src/main/resources/`, tests in `src/test/java/`.
