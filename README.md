# Querydsl
## 0. 레퍼런스 문서
http://www.querydsl.com/static/querydsl/4.0.1/reference/ko-KR/html_single/#d0e91

## 1. Maven 설정
### 의존 추가
```xml
<!-- Querydsl -->
<dependency>
    <groupId>com.querydsl</groupId>
    <artifactId>querydsl-apt</artifactId>
    <version>${querydsl.version}</version>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>com.querydsl</groupId>
    <artifactId>querydsl-jpa</artifactId>
    <version>${querydsl.version}</version>
</dependency>
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>1.6.1</version>
</dependency>
<!-- Querydsl -->
```
### APT 플러그인 추가
```xml
<!-- Querydsl -->
<plugin>
    <groupId>com.mysema.maven</groupId>
    <artifactId>apt-maven-plugin</artifactId>
    <version>1.1.3</version>
    <executions>
        <execution>
            <goals>
                <goal>process</goal>
            </goals>
            <configuration>
                <outputDirectory>target/generated-sources/java</outputDirectory>
                <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor>
            </configuration>
        </execution>
    </executions>
</plugin>
<!-- Querydsl -->
```
`JPAAnnotationProcessor`는 `javax.persistense.Entity` 어노테이션을 찾아 쿼리 타입을 생성한다.
Hibernate를 사용한다면 프로세스를 `com.querydsl.apt.hibernate.HibernateAnnotationProcessor`를 사용하면 된다.

## 2. Spring 도메인 생성
### 