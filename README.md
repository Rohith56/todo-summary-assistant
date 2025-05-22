# 📝 Todo Summary Assistant

A full-stack application that lets users manage personal to-do items, summarize pending tasks using OpenAI, and send the summary to a Slack channel.

---

## 🚀 Features

- ✅ Add, view, delete personal to-dos
- 🧠 Generate a meaningful summary using OpenAI (LLM)
- 📩 Post the summary to a Slack channel via webhook

---

## ⚙️ Tech Stack

| Layer      | Tech                          |
|------------|-------------------------------|
| Frontend   | React                         |
| Backend    | Java (Spring Boot)            |
| Database   | PostgreSQL (or Supabase)      |
| LLM API    | OpenAI GPT-3.5 Turbo          |
| Integration| Slack Incoming Webhooks       |

---

## 📁 Project Structure

todo-summary-assistant/
├── client/ # React frontend
├── server/ # Spring Boot backend
└── README.md # This file

---

## 🔧 Setup Instructions

### 💡 Prerequisites

- Node.js & npm
- Java JDK 17+
- PostgreSQL or Supabase account
- OpenAI account & API key
- Slack account with webhook enabled
- Git (for version control)

---

### 🖥️ Backend (Spring Boot)

1. Navigate to the backend directory:
cd server

2. Copy and configure environment file:
cp .env.example .env

3. Fill in .env with your credentials:
OPENAI_API_KEY=your_openai_key
SLACK_WEBHOOK_URL=https://hooks.slack.com/services/XXX/YYY/ZZZ
DATABASE_URL=jdbc:postgresql://localhost:5432/tododb
DB_USERNAME=your_db_username
DB_PASSWORD=your_db_password

4. Start the Spring Boot server:
./mvnw spring-boot:run

Runs at: http://localhost:8080


🌐 Frontend (React)
1. Navigate to the frontend directory:
cd client

2. Install dependencies:
npm install

3. Copy and configure .env:
cp .env.example .env

4. Set API URL:
REACT_APP_API_URL=http://localhost:8080

5. Start the app:
npm start
Opens at: http://localhost:3000

🧠 LLM & Slack Setup
🧠 OpenAI
1. Sign up: https://platform.openai.com
2. Get your API key: https://platform.openai.com/account/api-keys
3. Paste into your .env

📩 Slack Webhook
1. Go to: https://api.slack.com/messaging/webhooks
2. Create a new webhook to your channel
3. Copy the webhook URL and paste into .env

🧪 API Endpoints (Backend)
Method	Endpoint	Description
GET	/todos	Fetch all to-do items
POST	/todos	Add a new to-do
DELETE	/todos/{id}	Delete a to-do by ID
POST	/todos/summarize	Summarize todos and send to Slack
