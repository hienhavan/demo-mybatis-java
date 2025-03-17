
Dự án minh họa cách tích hợp MyBatis vào ứng dụng Spring Boot để quản lý và truy xuất dữ liệu từ cơ sở dữ liệu.

## Giới thiệu về MyBatis

MyBatis là một framework ORM Java, giúp lập trình viên tương tác với cơ sở dữ liệu một cách linh hoạt thông qua các câu lệnh SQL tùy chỉnh. MyBatis hỗ trợ hai cách định nghĩa câu lệnh SQL:

**Dùng annotations:** Định nghĩa trực tiếp trong các interface Java bằng cách sử dụng các chú thích như `@Select`, `@Insert`, `@Update`, `@Delete`.

 **XML Mapper Files:** Định nghĩa trong các tệp XML riêng biệt, giúp quản lý các câu lệnh SQL phức tạp và dễ dàng bảo trì hơn.

## Cấu trúc dự án

Dự án được tổ chức theo cấu trúc sau:


## Hướng dẫn khởi động dự án

 **Cài đặt Docker và Docker Compose:** Đảm bảo rằng Docker và Docker Compose đã được cài đặt trên hệ thống của bạn.

 **Khởi động PostgreSQL bằng Docker Compose:**

   - Tệp `docker-compose.yml` được cấu hình để chạy PostgreSQL. Khởi động dịch vụ bằng lệnh:

     ```bash
     docker-compose up -d
     ```

   - Tệp `init.sql` sẽ được thực thi tự động để tạo cơ sở dữ liệu và bảng cần thiết.

 **Cấu hình kết nối cơ sở dữ liệu:**

   - Mở tệp `src/main/resources/application.properties` và đảm bảo thông tin kết nối phù hợp:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/mydb
     spring.datasource.username=mydb
     spring.datasource.password=12345

     mybatis.mapper-locations=classpath:mappers/*.xml
     ```

## Sử dụng MyBatis với Annotations

Trong dự án này, interface `UserMapper` sử dụng các chú thích để định nghĩa các câu lệnh SQL và sử dụng MyBatis với XML Mapper Interface UserMapperXml kết hợp với tệp UserMapperXml.xml để định nghĩa các câu lệnh SQL:
## Lưu ý khi sử dụng XML Mapper

Khai báo namespace: Đảm bảo thuộc tính namespace trong file XML trùng với đường dẫn đầy đủ của interface mapper tương ứng.
Định nghĩa các phương thức: Các phương thức trong interface mapper phải khớp với các id của các phần tử trong file XML.
Cấu hình MyBatis: Đảm bảo MyBatis được cấu hình để tìm và load các file XML mapper. Trong Spring Boot, bạn có thể sử dụng thuộc tính mybatis.mapper-locations trong application.properties để chỉ định đường dẫn tới các file XML mapper.
