@echo off
echo --- Education Management System Launcher ---
echo.

echo [1/2] Compiling...
if not exist "out" mkdir out
javac -d out -sourcepath src src/Main.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation failed. Please check the errors above.
    pause
    exit /b
)

echo [2/2] Running Application...
echo.
echo NOTE: Please type your input numbers (1-6) and press ENTER when prompted.
echo.

java -cp out Main

echo.
echo Application finished.
pause
