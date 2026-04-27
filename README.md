# Gardnercraft

Gardnercraft is a Fabric server-side mod that adds Gardnercraft-themed items and an armor trim while using Polymer so vanilla clients can see the custom textures through a server resource pack.

## Features

- Adds `The Gardnercraft` custom item.
- Adds the Gardnercraft armor trim smithing template.
- Includes custom item and armor trim textures.
- Uses Polymer resource pack metadata so the server-generated pack includes this mod's assets.

## Requirements

- Minecraft `1.21.11`
- Fabric Loader `0.18.6` or newer
- Java `21`
- Fabric API
- Polymer bundled `0.15.2+1.21.11` on the server

Vanilla clients can join, but they must accept the server resource pack to see the custom textures.

## Building

Run:

```powershell
./gradlew build
```

On Windows, this project writes Gradle build output to:

```text
%LOCALAPPDATA%\GardnercraftMod\build
```

This avoids OneDrive file-lock issues when the project is stored inside a synced Desktop folder. On other operating systems, Gradle uses the normal project `build/` directory.

The built mod jar is created under:

```text
%LOCALAPPDATA%\GardnercraftMod\build\libs
```

## Server Installation

Place the Gardnercraft mod jar in the server `mods` folder.

Also place Polymer bundled in the server `mods` folder:

```text
polymer-bundled-0.15.2+1.21.11.jar
```

Start the server once, then enable Polymer AutoHost in:

```text
config/polymer/auto-host.json
```

Set:

```json
{
  "enabled": true
}
```

If the server is behind a proxy, tunnel, panel, or domain setup, make sure AutoHost is configured with a public address that players can reach. If the resource pack prompt appears but the client fails to download it, the AutoHost URL is the first thing to check.

## Development Notes

Polymer dependencies are resolved through the Nucleoid Maven repository. The local `libs/` folder is intentionally ignored and should not be committed.

Do not commit generated folders or files such as:

- `.gradle/`
- `build/`
- `bin/`
- `libs/`
- generated mod jars
- generated Polymer resource packs
- server logs, worlds, configs, or crash reports

## License

This project is currently marked as `All Rights Reserved` in `fabric.mod.json`.

If this repository is made public and you want other people to reuse, modify, or contribute to the code, choose a license and update both this README and `src/main/resources/fabric.mod.json`.
