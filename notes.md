# Credit Risk Engine – Dev Notes

## 📌 Purpose
Building a secure, scalable backend system to model credit risk and detect fraud.

## 🧱 Dependencies & Why
- `spring-boot-starter-web`: REST API support.
- `spring-boot-starter-data-jpa`: ORM support with JPA/Hibernate.
- `lombok`: Reduces boilerplate (getters, setters).

## 🐞 Errors & Fixes
### [June 8, 2025] – Spring Boot Startup Failure
**Error:** "Failed to configure a DataSource: 'url' attribute is not specified..."  
**Fix:** Commented out `spring-data-jpa` since DB was not yet configured.

### [June 8, 2025] – 404 on `/`
**Cause:** Main class was in a different package than the controller.  
**Fix:** Moved main class under same root package (`com.example.creditrisk`).

## 💡 Decisions Made
- Using `REST` instead of `GraphQL` for simplicity.
- Local `H2` DB for now — plan to switch to Postgres later.

## 🧠 Learnings
- Spring Boot's package structure is strict.
- GitHub requires token auth for HTTPS pushes.

