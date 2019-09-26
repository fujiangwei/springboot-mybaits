# bat模块
```text
该模块包含调用comm模块的mapper接口的service服务，以及测试controller，需要引入comm模块依赖
```
## mapperScan

    @SpringBootApplication
    // 路径设置为comm模块的mapper路径
    @MapperScan(basePackages = {"com.kinson.comm.mapper"})
    public class BatApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(BatApplication.class, args);
        }
    
    }

## 配置文件application.yml

    # MyBatis
    mybatis:
      type-aliases-package: com.kinson.comm.domain
      mapper-locations: classpath:/mybatis/*.xml
