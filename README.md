# 🎉 Welcome to the DemoTracingService Project 🎉

This guide will help you get the project up and running in just a few easy steps.

---

## 🚀 Quick Start Guide

### 1. **Install Docker 🐳**

Docker is a tool that makes it easy to run applications. To install it, follow these steps:

- **Windows or macOS**:
  - Go to [Docker's official download page](https://www.docker.com/products/docker-desktop) and download **Docker Desktop**.
  - Install the downloaded file and follow the instructions on the screen.
  - Once installed, launch Docker Desktop. You should see the Docker whale icon in your system tray! 🐋

---

### 2. **Clone the Repository 📁**

You will need to download the project files onto your computer. To do this:

- **Step 1**: Open a terminal (or Command Prompt on Windows).
- **Step 2**: Run the following command to clone the repository:
  ```bash
  git clone https://github.com/Ashu-Acuver/DistributedTracingService.git
  ```
This will create a folder on your computer with all the project files.

---

### 3. **Run Docker Compose 🚢**

We use Docker Compose to run the application and its dependencies easily. Once you have Docker installed and the repository cloned, follow these steps:

- **Step 1**: Navigate into the project folder you just cloned:
  ```bash
  cd DemoTracingService
  ```
- **Step 2**: Run the following command to start the application:
  ```bash
  docker-compose up -d
  ```
Docker will download the necessary images and start the service for you. This might take a few minutes, but don't worry—Docker is doing all the heavy lifting for you! 🛠️

---

### 4. **Run the Service 🎯**

Once Docker is finished setting everything up, your service is ready to run. Simply open your browser and go to:

```plaintext
http://localhost:8081/hello
```
You should see a message something like below
```plaintext
{ "args": {}, "data": "hello, Cloud!", "files": {}, "form": {}, "headers": { "Accept": "text/plain, application/json, application/*+json, */*", "Accept-Encoding": "gzip", "Content-Length": "13",
"Content-Type": "text/plain;charset=UTF-8", "Host": "httpbin.org", "Traceparent": "00-241ef7aa07a7f3437036b4ced2755a68-7f8b309b8ad01d40-01", "User-Agent": "okhttp/4.12.0", "X-Amzn-Trace-Id":
"Root=1-66df0cbd-126a93ba69c549ac4d35a3f5" }, "json": null, "origin": "103.16.69.132", "url": "https://httpbin.org/post" }
```
---

## 🎯 Final Notes

- To stop the application, you can run:
  ```bash
  docker-compose down
  ```
If you encounter any issues, don’t hesitate to reach out! We’re here to help. 💡

---

## 💡 What Did We Just Do?

- **Installed Docker**: This allowed us to run the application in a controlled environment.
- **Cloned the Repository**: We got the project files onto your machine.
- **Ran Docker Compose**: This started up everything we need in the background.
- **Visited the Service**: You interacted with the running service through your browser!
