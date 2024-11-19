Shell Scripting

                                

What is Kernel?

The kernel is the heart of an operating system, responsible for managing the system's hardware and software resources. It handles tasks like:

    Allocating memory to programs.
    Managing CPU tasks through scheduling.
    Providing a way for software to communicate with hardware through drivers.

Without the kernel, the operating system cannot function, as it acts as a bridge between the hardware and software.

What is Shell?

A shell is a command-line interface that lets users interact with the operating system. It interprets and executes commands you type.

    Interactive Mode: You type commands, and the shell responds.
    Scripting Mode: You write a series of commands in a file (script) for execution.

How to Find Your Shell

Run the command:

echo $SHELL

This displays the default shell for your user, like /bin/bash or /bin/zsh.

What is a Shell Script?

A shell script is a file containing a sequence of shell commands, written to automate repetitive tasks.

    It is written in plain text and typically saved with a .sh extension.
    Shell scripts can include variables, loops, and conditionals for dynamic operations.
Example shell script:

#!/bin/bash
echo "Hello, World!"

The #!/bin/bash tells the system to use the Bash shell to run the script.
Types of Linux Shells

Linux supports various shells, each with its own features:

    Bash (Bourne Again Shell): The most common shell, known for its scripting capabilities.
    Sh (Bourne Shell): A simpler, older shell.
    Zsh (Z Shell): Provides advanced customization and scripting features.
    Ksh (Korn Shell): Offers scripting features with better performance.
Tcsh (C Shell): Scripting syntax similar to the C programming language.



Starting a Shell

A shell starts automatically when you open a terminal emulator (like GNOME Terminal, Konsole, or xterm). If you want to start a specific shell, you can type its name, such as:

bash
zsh

How to Run a Shell Script?

    Make it executable:
    Before running, you need to grant execute permission:

chmod +x script.sh

Run the script:

    Using Absolute Path: Specify the full path to the script:

/home/user/scripts/script.sh

Using Relative Path: Specify the path relative to the current directory:

        ./script.sh

Difference Between Absolute and Relative Path:

    Absolute Path: Always starts from the root directory (/) and gives the full location of the file.
    Example: /home/user/scripts/script.sh
    Relative Path: Refers to the location relative to your current directory.
    Example: ./script.sh (for a script in the current folder).






Scripting Standards

Scripting standards are rules and best practices that help in writing clean, organized, and maintainable scripts. These include:

    Use clear names for scripts and variables.
    Add comments to explain the purpose of complex lines.
    Follow proper indentation for readability.
Write portable scripts that can work across environments.


Script Naming Convention

    Use lowercase letters and separate words with underscores (_).
Example: backup_files.sh

    Names should describe the script’s purpose.
    Example: Use clean_temp_files.sh instead of script1.sh.

Avoid special characters or spaces.


Script File Permissions

In Linux, permissions define who can read, write, and execute a script. These permissions are crucial for controlling access to your script and ensuring it can be executed.
Types of Permissions

    Read (r): Allows the file to be read or viewed.
    Write (w): Allows the file to be edited or modified.
    Execute (x): Allows the file to be run as a program or script.

Checking File Permissions

Use the ls -l command to view the permissions of a file.
Example:

ls -l script.sh

Output:

-rwxr-xr-- 1 user group 1234 Nov 18 10:00 script.sh

    -rwxr-xr-- represents the permissions:
        rwx (Owner): The owner can read, write, and execute.
        r-x (Group): The group can read and execute.
        r-- (Others): Others can only read.

Changing File Permissions

Use the chmod command to modify permissions.
Grant Execute Permission



Make a script executable:

chmod +x script.sh

Change All Permissions

    Grant read, write, and execute to the owner; read and execute to the group; and read to others:

    chmod 754 script.sh

    Explanation of 754:
        7 (Owner): Read (4) + Write (2) + Execute (1) = 7
        5 (Group): Read (4) + Execute (1) = 5
        4 (Others): Read (4) = 4

Testing File Permissions

    If a script lacks execute permission, you’ll get a Permission denied error:
    ./script.sh

    After granting execute permission (chmod +x), you can run the script.

Best Practices for Permissions

    Assign minimal permissions to avoid security risks.
    Example: Use chmod 700 script.sh for private scripts (only the owner can read, write, and execute).
    For shared scripts, use group-based permissions (chmod 750 script.sh).
Avoid giving write access to "others" (chmod o-w script.sh).


Script Format

A script typically has:

    Shebang: The first line starts with #!, followed by the path of the shell to execute the script.
    Example:

#!/bin/bash

Comments: Use # to add explanations in the script.
Example:

# This script backs up files

Variables: Store reusable values.
Example:

FILE_PATH="/home/user/data"

Commands: Execute tasks like file operations, displaying output, etc.
Example:
ls -l

Statements: Add logic using conditionals (if), loops (for), etc.
Example:

    if [ -d $FILE_PATH ]; then
        echo "Directory exists"
Fi


Sequence of Script Execution

    Shebang Execution
    The script starts with #! (shebang) to tell the system which shell to use (e.g., #!/bin/bash).

    Comments Ignored
    Lines starting with # are ignored by the shell. These are for notes or explanations.

    Command Execution
    Each command is executed line by line, in the order they appear.

    Variable Assignment
    Variables are initialized and can be used in later commands.
    Example:

NAME="John"
echo "Hello, $NAME"

Control Structures
Loops (for, while) and conditions (if) control the flow of execution.
Example:

if [ -d /tmp ]; then
    echo "Temp directory exists"
fi

Error Handling
The script continues even if a command fails unless you use set -e to stop on errors.

End of Script
The script ends after all lines are executed or when an exit command is encountered.

















What are Variables?

Variables are placeholders for storing data, like text or numbers, that can be reused. They make scripts dynamic and customizable.
How to Create Variables

    Declare a variable by assigning a value (no spaces around =).
    Example:

NAME="John"

Access variables using the $ symbol.
Example:

    echo "Hello, $NAME"

    Variables can be updated or modified in the script.

Types of Variables

    System Variables: Predefined by the system (e.g., $PATH, $HOME).
    User-Defined Variables: Declared by the user.

By following these principles and understanding the structure, you can write better, more efficient shell scripts!




