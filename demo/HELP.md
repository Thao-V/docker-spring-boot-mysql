# Getting Started
# Create .env
DATABASE_URL=
DATABASE_USERNAME=
DATABASE_PASSWORD=
REMOTE_SECRET=
# Run with docker
1. Package: mvn clean package
2. Build the docker-image: mvn spring-boot:build-image
3. Run: docker run -t -p 8000:8080 <docker-file>

