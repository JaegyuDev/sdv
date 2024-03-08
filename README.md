# JaegyuDev/fabric-template
> A simple template for my fabric projects.

## Cloning / Creating from template
This is the entire purpose of this template. I recommend using GithubCLI which super simplifies this process.

`gh repo create <new-project-name> --template=JaegyuDev/fabric-template --public`

I'd replace `JaegyuDev/fabric-template` with your own template repo.

## Tests
To enable tests you'll need to uncomment some lines in the `build.gradle` file. They are already marked, you just need to find them.
Then you can enable the workflow by running `gh workflow enable test`
## Notes
This isn't meant to be used by others. It can however be used as a reference -or directly- to create your own templates. Simply change the paths under `src/` and the corresponding fields in `src/main/resources/fabric.mod.json`.

## License
I use a `BSD-3-Clause` license in my projects. However, if you use this in any form, I am waiving all rights, and you don't need to credit me as long as you remove my contact information from the `fabric.mod.json` file. This only applies to the `JaegyuDev/fabric-template` repo.
