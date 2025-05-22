# 📚 Spring Boot + MyBatis + HsqlDB Application

도서 관리 시스템 데모 애플리케이션입니다.  
Spring Boot와 MyBatis를 기반으로 개발되었으며, 간단한 웹 UI는 Thymeleaf를 통해 제공합니다.  
내장형 HsqlDB를 사용하여 빠르게 개발 및 테스트가 가능합니다.

<br>

## 🛠 기술 스택

### 🔧 Backend
- **Spring Boot 3.4.5** – 웹 애플리케이션 프레임워크
- **MyBatis 3.0.4** – SQL 매핑 프레임워크
- **Spring Boot Starter Web** – RESTful 웹 서비스 구성

### 🎨 Frontend
- **Thymeleaf** – 서버사이드 템플릿 엔진

### 🗄 Database
- **HsqlDB** – 경량 임베디드형 관계형 데이터베이스 (개발 및 테스트 용도)

<br>

## 📁 프로젝트 구조
```yaml
├── src/main/java/com/aidd/demo/
│ ├── controller/ # 웹 컨트롤러 레이어
│ ├── domain/ # 도메인 모델 클래스
│ ├── dto/ # 데이터 전송 객체
│ ├── mapper/ # MyBatis 매퍼 인터페이스
│ ├── service/ # 비즈니스 로직 서비스
│ └── DemoApplication.java # Spring Boot 메인 클래스
│
├── src/main/resources/
│ ├── mybatis/mappers/ # MyBatis XML 매퍼 파일
│ ├── templates/ # Thymeleaf 템플릿 파일
│ ├── application.properties # 애플리케이션 설정
│ ├── data.sql # 초기 데이터 스크립트
│ └── schema.sql # 데이터베이스 스키마
└── readme.md
```

<br>

## 🚀 실행 방법

1. **프로젝트 클론**
```bash
git clone https://github.com/your-repo/spring-boot-demo.git
cd spring-boot-demo
```

2. **애플리케이션 실행**
```bash
./mvnw spring-boot:run
```

3. **웹 브라우저 접속**
```bash
http://localhost:8080
```

<br>

## 참고
https://yellow.kr/blog/spring-boot-mybatis-hsqldb/