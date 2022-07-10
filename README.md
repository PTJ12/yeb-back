# yeb-back
云E办接口
实现验证码登录

## 文件结构
```text
├─HELP.md
├─img.png
├─pom.xml
├─README.md
├─yeb.iml
├─yeb-server
|     ├─pom.xml
|     ├─yeb-server.iml
|     ├─target
|     |   ├─yeb-server.jar
|     |   ├─yeb-server.jar.original
|     |   ├─test-classes
|     |   ├─maven-status
|     |   |      ├─maven-compiler-plugin
|     |   |      |           ├─testCompile
|     |   |      |           |      ├─default-testCompile
|     |   |      |           |      |          ├─createdFiles.lst
|     |   |      |           |      |          └inputFiles.lst
|     |   |      |           ├─compile
|     |   |      |           |    ├─default-compile
|     |   |      |           |    |        ├─createdFiles.lst
|     |   |      |           |    |        └inputFiles.lst
|     |   ├─maven-archiver
|     |   |       └pom.properties
|     |   ├─generated-test-sources
|     |   |           ├─test-annotations
|     |   ├─generated-sources
|     |   |         ├─annotations
|     |   ├─classes
|     |   |    ├─application.yml
|     |   |    ├─mapper
|     |   |    |   ├─AdminMapper.xml
|     |   |    |   ├─AdminRoleMapper.xml
|     |   |    |   ├─AppraiseMapper.xml
|     |   |    |   ├─DepartmentMapper.xml
|     |   |    |   ├─EmployeeEcMapper.xml
|     |   |    |   ├─EmployeeMapper.xml
|     |   |    |   ├─EmployeeRemoveMapper.xml
|     |   |    |   ├─EmployeeTrainMapper.xml
|     |   |    |   ├─JoblevelMapper.xml
|     |   |    |   ├─MenuMapper.xml
|     |   |    |   ├─MenuRoleMapper.xml
|     |   |    |   ├─NationMapper.xml
|     |   |    |   ├─OplogMapper.xml
|     |   |    |   ├─PoliticsStatusMapper.xml
|     |   |    |   ├─RoleMapper.xml
|     |   |    |   ├─SalaryAdjustMapper.xml
|     |   |    |   ├─SalaryMapper.xml
|     |   |    |   ├─SysMsgContentMapper.xml
|     |   |    |   └SysMsgMapper.xml
|     |   |    ├─cn
|     |   |    | ├─ut
|     |   |    | | ├─server
|     |   |    | | |   ├─YebApplication.class
|     |   |    | | |   ├─service
|     |   |    | | |   |    ├─IAdminRoleService.class
|     |   |    | | |   |    ├─IAdminService.class
|     |   |    | | |   |    ├─IAppraiseService.class
|     |   |    | | |   |    ├─IDepartmentService.class
|     |   |    | | |   |    ├─IEmployeeEcService.class
|     |   |    | | |   |    ├─IEmployeeRemoveService.class
|     |   |    | | |   |    ├─IEmployeeService.class
|     |   |    | | |   |    ├─IEmployeeTrainService.class
|     |   |    | | |   |    ├─IJoblevelService.class
|     |   |    | | |   |    ├─IMenuRoleService.class
|     |   |    | | |   |    ├─IMenuService.class
|     |   |    | | |   |    ├─INationService.class
|     |   |    | | |   |    ├─IOplogService.class
|     |   |    | | |   |    ├─IPoliticsStatusService.class
|     |   |    | | |   |    ├─IRoleService.class
|     |   |    | | |   |    ├─ISalaryAdjustService.class
|     |   |    | | |   |    ├─ISalaryService.class
|     |   |    | | |   |    ├─ISysMsgContentService.class
|     |   |    | | |   |    ├─ISysMsgService.class
|     |   |    | | |   |    ├─impl
|     |   |    | | |   |    |  ├─AdminRoleServiceImpl.class
|     |   |    | | |   |    |  ├─AdminServiceImpl.class
|     |   |    | | |   |    |  ├─AppraiseServiceImpl.class
|     |   |    | | |   |    |  ├─DepartmentServiceImpl.class
|     |   |    | | |   |    |  ├─EmployeeEcServiceImpl.class
|     |   |    | | |   |    |  ├─EmployeeRemoveServiceImpl.class
|     |   |    | | |   |    |  ├─EmployeeServiceImpl.class
|     |   |    | | |   |    |  ├─EmployeeTrainServiceImpl.class
|     |   |    | | |   |    |  ├─JoblevelServiceImpl.class
|     |   |    | | |   |    |  ├─MenuRoleServiceImpl.class
|     |   |    | | |   |    |  ├─MenuServiceImpl.class
|     |   |    | | |   |    |  ├─NationServiceImpl.class
|     |   |    | | |   |    |  ├─OplogServiceImpl.class
|     |   |    | | |   |    |  ├─PoliticsStatusServiceImpl.class
|     |   |    | | |   |    |  ├─RoleServiceImpl.class
|     |   |    | | |   |    |  ├─SalaryAdjustServiceImpl.class
|     |   |    | | |   |    |  ├─SalaryServiceImpl.class
|     |   |    | | |   |    |  ├─SysMsgContentServiceImpl.class
|     |   |    | | |   |    |  └SysMsgServiceImpl.class
|     |   |    | | |   ├─pojo
|     |   |    | | |   |  ├─Admin.class
|     |   |    | | |   |  ├─AdminLogin.class
|     |   |    | | |   |  ├─AdminRole.class
|     |   |    | | |   |  ├─Appraise.class
|     |   |    | | |   |  ├─Department.class
|     |   |    | | |   |  ├─Employee.class
|     |   |    | | |   |  ├─EmployeeEc.class
|     |   |    | | |   |  ├─EmployeeRemove.class
|     |   |    | | |   |  ├─EmployeeTrain.class
|     |   |    | | |   |  ├─Joblevel.class
|     |   |    | | |   |  ├─Menu.class
|     |   |    | | |   |  ├─MenuRole.class
|     |   |    | | |   |  ├─Nation.class
|     |   |    | | |   |  ├─Oplog.class
|     |   |    | | |   |  ├─PoliticsStatus.class
|     |   |    | | |   |  ├─RespBean.class
|     |   |    | | |   |  ├─Role.class
|     |   |    | | |   |  ├─Salary.class
|     |   |    | | |   |  ├─SalaryAdjust.class
|     |   |    | | |   |  ├─SysMsg.class
|     |   |    | | |   |  └SysMsgContent.class
|     |   |    | | |   ├─mapper
|     |   |    | | |   |   ├─AdminMapper.class
|     |   |    | | |   |   ├─AdminRoleMapper.class
|     |   |    | | |   |   ├─AppraiseMapper.class
|     |   |    | | |   |   ├─DepartmentMapper.class
|     |   |    | | |   |   ├─EmployeeEcMapper.class
|     |   |    | | |   |   ├─EmployeeMapper.class
|     |   |    | | |   |   ├─EmployeeRemoveMapper.class
|     |   |    | | |   |   ├─EmployeeTrainMapper.class
|     |   |    | | |   |   ├─JoblevelMapper.class
|     |   |    | | |   |   ├─MenuMapper.class
|     |   |    | | |   |   ├─MenuRoleMapper.class
|     |   |    | | |   |   ├─NationMapper.class
|     |   |    | | |   |   ├─OplogMapper.class
|     |   |    | | |   |   ├─PoliticsStatusMapper.class
|     |   |    | | |   |   ├─RoleMapper.class
|     |   |    | | |   |   ├─SalaryAdjustMapper.class
|     |   |    | | |   |   ├─SalaryMapper.class
|     |   |    | | |   |   ├─SysMsgContentMapper.class
|     |   |    | | |   |   └SysMsgMapper.class
|     |   |    | | |   ├─controller
|     |   |    | | |   |     ├─AdminController.class
|     |   |    | | |   |     ├─AdminRoleController.class
|     |   |    | | |   |     ├─AppraiseController.class
|     |   |    | | |   |     ├─CaptchaController.class
|     |   |    | | |   |     ├─DepartmentController.class
|     |   |    | | |   |     ├─EmployeeController.class
|     |   |    | | |   |     ├─EmployeeEcController.class
|     |   |    | | |   |     ├─EmployeeRemoveController.class
|     |   |    | | |   |     ├─EmployeeTrainController.class
|     |   |    | | |   |     ├─HelloController.class
|     |   |    | | |   |     ├─JoblevelController.class
|     |   |    | | |   |     ├─LoginController.class
|     |   |    | | |   |     ├─MenuController.class
|     |   |    | | |   |     ├─MenuRoleController.class
|     |   |    | | |   |     ├─NationController.class
|     |   |    | | |   |     ├─OplogController.class
|     |   |    | | |   |     ├─PoliticsStatusController.class
|     |   |    | | |   |     ├─RoleController.class
|     |   |    | | |   |     ├─SalaryAdjustController.class
|     |   |    | | |   |     ├─SalaryController.class
|     |   |    | | |   |     ├─SysMsgContentController.class
|     |   |    | | |   |     ├─SysMsgController.class
|     |   |    | | |   |     └TestController.class
|     |   |    | | |   ├─config
|     |   |    | | |   |   ├─Swagger2Config.class
|     |   |    | | |   |   ├─security
|     |   |    | | |   |   |    ├─CaptchaConfig.class
|     |   |    | | |   |   |    ├─JwtAuthorizationTokenFilter.class
|     |   |    | | |   |   |    ├─JwtTokenUtil.class
|     |   |    | | |   |   |    ├─RestAuthorizationEntryPoint.class
|     |   |    | | |   |   |    ├─RestfullAccessDeniedHandler.class
|     |   |    | | |   |   |    └SecurityConfig.class
|     ├─src
|     |  ├─test
|     |  |  ├─java
|     |  ├─main
|     |  |  ├─resources
|     |  |  |     ├─application.yml
|     |  |  |     ├─mapper
|     |  |  |     |   ├─AdminMapper.xml
|     |  |  |     |   ├─AdminRoleMapper.xml
|     |  |  |     |   ├─AppraiseMapper.xml
|     |  |  |     |   ├─DepartmentMapper.xml
|     |  |  |     |   ├─EmployeeEcMapper.xml
|     |  |  |     |   ├─EmployeeMapper.xml
|     |  |  |     |   ├─EmployeeRemoveMapper.xml
|     |  |  |     |   ├─EmployeeTrainMapper.xml
|     |  |  |     |   ├─JoblevelMapper.xml
|     |  |  |     |   ├─MenuMapper.xml
|     |  |  |     |   ├─MenuRoleMapper.xml
|     |  |  |     |   ├─NationMapper.xml
|     |  |  |     |   ├─OplogMapper.xml
|     |  |  |     |   ├─PoliticsStatusMapper.xml
|     |  |  |     |   ├─RoleMapper.xml
|     |  |  |     |   ├─SalaryAdjustMapper.xml
|     |  |  |     |   ├─SalaryMapper.xml
|     |  |  |     |   ├─SysMsgContentMapper.xml
|     |  |  |     |   └SysMsgMapper.xml
|     |  |  ├─java
|     |  |  |  ├─cn
|     |  |  |  | ├─ut
|     |  |  |  | | ├─server
|     |  |  |  | | |   ├─YebApplication.java
|     |  |  |  | | |   ├─service
|     |  |  |  | | |   |    ├─IAdminRoleService.java
|     |  |  |  | | |   |    ├─IAdminService.java
|     |  |  |  | | |   |    ├─IAppraiseService.java
|     |  |  |  | | |   |    ├─IDepartmentService.java
|     |  |  |  | | |   |    ├─IEmployeeEcService.java
|     |  |  |  | | |   |    ├─IEmployeeRemoveService.java
|     |  |  |  | | |   |    ├─IEmployeeService.java
|     |  |  |  | | |   |    ├─IEmployeeTrainService.java
|     |  |  |  | | |   |    ├─IJoblevelService.java
|     |  |  |  | | |   |    ├─IMenuRoleService.java
|     |  |  |  | | |   |    ├─IMenuService.java
|     |  |  |  | | |   |    ├─INationService.java
|     |  |  |  | | |   |    ├─IOplogService.java
|     |  |  |  | | |   |    ├─IPoliticsStatusService.java
|     |  |  |  | | |   |    ├─IRoleService.java
|     |  |  |  | | |   |    ├─ISalaryAdjustService.java
|     |  |  |  | | |   |    ├─ISalaryService.java
|     |  |  |  | | |   |    ├─ISysMsgContentService.java
|     |  |  |  | | |   |    ├─ISysMsgService.java
|     |  |  |  | | |   |    ├─impl
|     |  |  |  | | |   |    |  ├─AdminRoleServiceImpl.java
|     |  |  |  | | |   |    |  ├─AdminServiceImpl.java
|     |  |  |  | | |   |    |  ├─AppraiseServiceImpl.java
|     |  |  |  | | |   |    |  ├─DepartmentServiceImpl.java
|     |  |  |  | | |   |    |  ├─EmployeeEcServiceImpl.java
|     |  |  |  | | |   |    |  ├─EmployeeRemoveServiceImpl.java
|     |  |  |  | | |   |    |  ├─EmployeeServiceImpl.java
|     |  |  |  | | |   |    |  ├─EmployeeTrainServiceImpl.java
|     |  |  |  | | |   |    |  ├─JoblevelServiceImpl.java
|     |  |  |  | | |   |    |  ├─MenuRoleServiceImpl.java
|     |  |  |  | | |   |    |  ├─MenuServiceImpl.java
|     |  |  |  | | |   |    |  ├─NationServiceImpl.java
|     |  |  |  | | |   |    |  ├─OplogServiceImpl.java
|     |  |  |  | | |   |    |  ├─PoliticsStatusServiceImpl.java
|     |  |  |  | | |   |    |  ├─RoleServiceImpl.java
|     |  |  |  | | |   |    |  ├─SalaryAdjustServiceImpl.java
|     |  |  |  | | |   |    |  ├─SalaryServiceImpl.java
|     |  |  |  | | |   |    |  ├─SysMsgContentServiceImpl.java
|     |  |  |  | | |   |    |  └SysMsgServiceImpl.java
|     |  |  |  | | |   ├─pojo
|     |  |  |  | | |   |  ├─Admin.java
|     |  |  |  | | |   |  ├─AdminLogin.java
|     |  |  |  | | |   |  ├─AdminRole.java
|     |  |  |  | | |   |  ├─Appraise.java
|     |  |  |  | | |   |  ├─Department.java
|     |  |  |  | | |   |  ├─Employee.java
|     |  |  |  | | |   |  ├─EmployeeEc.java
|     |  |  |  | | |   |  ├─EmployeeRemove.java
|     |  |  |  | | |   |  ├─EmployeeTrain.java
|     |  |  |  | | |   |  ├─Joblevel.java
|     |  |  |  | | |   |  ├─Menu.java
|     |  |  |  | | |   |  ├─MenuRole.java
|     |  |  |  | | |   |  ├─Nation.java
|     |  |  |  | | |   |  ├─Oplog.java
|     |  |  |  | | |   |  ├─PoliticsStatus.java
|     |  |  |  | | |   |  ├─RespBean.java
|     |  |  |  | | |   |  ├─Role.java
|     |  |  |  | | |   |  ├─Salary.java
|     |  |  |  | | |   |  ├─SalaryAdjust.java
|     |  |  |  | | |   |  ├─SysMsg.java
|     |  |  |  | | |   |  └SysMsgContent.java
|     |  |  |  | | |   ├─mapper
|     |  |  |  | | |   |   ├─AdminMapper.java
|     |  |  |  | | |   |   ├─AdminRoleMapper.java
|     |  |  |  | | |   |   ├─AppraiseMapper.java
|     |  |  |  | | |   |   ├─DepartmentMapper.java
|     |  |  |  | | |   |   ├─EmployeeEcMapper.java
|     |  |  |  | | |   |   ├─EmployeeMapper.java
|     |  |  |  | | |   |   ├─EmployeeRemoveMapper.java
|     |  |  |  | | |   |   ├─EmployeeTrainMapper.java
|     |  |  |  | | |   |   ├─JoblevelMapper.java
|     |  |  |  | | |   |   ├─MenuMapper.java
|     |  |  |  | | |   |   ├─MenuRoleMapper.java
|     |  |  |  | | |   |   ├─NationMapper.java
|     |  |  |  | | |   |   ├─OplogMapper.java
|     |  |  |  | | |   |   ├─PoliticsStatusMapper.java
|     |  |  |  | | |   |   ├─RoleMapper.java
|     |  |  |  | | |   |   ├─SalaryAdjustMapper.java
|     |  |  |  | | |   |   ├─SalaryMapper.java
|     |  |  |  | | |   |   ├─SysMsgContentMapper.java
|     |  |  |  | | |   |   └SysMsgMapper.java
|     |  |  |  | | |   ├─controller
|     |  |  |  | | |   |     ├─AdminController.java
|     |  |  |  | | |   |     ├─AdminRoleController.java
|     |  |  |  | | |   |     ├─AppraiseController.java
|     |  |  |  | | |   |     ├─CaptchaController.java
|     |  |  |  | | |   |     ├─DepartmentController.java
|     |  |  |  | | |   |     ├─EmployeeController.java
|     |  |  |  | | |   |     ├─EmployeeEcController.java
|     |  |  |  | | |   |     ├─EmployeeRemoveController.java
|     |  |  |  | | |   |     ├─EmployeeTrainController.java
|     |  |  |  | | |   |     ├─HelloController.java
|     |  |  |  | | |   |     ├─JoblevelController.java
|     |  |  |  | | |   |     ├─LoginController.java
|     |  |  |  | | |   |     ├─MenuController.java
|     |  |  |  | | |   |     ├─MenuRoleController.java
|     |  |  |  | | |   |     ├─NationController.java
|     |  |  |  | | |   |     ├─OplogController.java
|     |  |  |  | | |   |     ├─PoliticsStatusController.java
|     |  |  |  | | |   |     ├─RoleController.java
|     |  |  |  | | |   |     ├─SalaryAdjustController.java
|     |  |  |  | | |   |     ├─SalaryController.java
|     |  |  |  | | |   |     ├─SysMsgContentController.java
|     |  |  |  | | |   |     ├─SysMsgController.java
|     |  |  |  | | |   |     └TestController.java
|     |  |  |  | | |   ├─config
|     |  |  |  | | |   |   ├─Swagger2Config.java
|     |  |  |  | | |   |   ├─security
|     |  |  |  | | |   |   |    ├─CaptchaConfig.java
|     |  |  |  | | |   |   |    ├─JwtAuthorizationTokenFilter.java
|     |  |  |  | | |   |   |    ├─JwtTokenUtil.java
|     |  |  |  | | |   |   |    ├─RestAuthorizationEntryPoint.java
|     |  |  |  | | |   |   |    ├─RestfullAccessDeniedHandler.java
|     |  |  |  | | |   |   |    └SecurityConfig.java
├─yeb-generator
|       ├─pom.xml
|       ├─yeb-generator.iml
|       ├─target
|       |   ├─yeb-generator-0.0.1-SNAPSHOT.jar
|       |   ├─maven-status
|       |   |      ├─maven-compiler-plugin
|       |   |      |           ├─compile
|       |   |      |           |    ├─default-compile
|       |   |      |           |    |        ├─createdFiles.lst
|       |   |      |           |    |        └inputFiles.lst
|       |   ├─maven-archiver
|       |   |       └pom.properties
|       |   ├─generated-sources
|       |   |         ├─annotations
|       |   ├─classes
|       |   |    ├─cn
|       |   |    | ├─ut
|       |   |    | | ├─generator
|       |   |    | | |     ├─CodeGenerator$1.class
|       |   |    | | |     ├─CodeGenerator$2.class
|       |   |    | | |     └CodeGenerator.class
|       ├─src
|       |  ├─main
|       |  |  ├─resources
|       |  |  ├─java
|       |  |  |  ├─cn
|       |  |  |  | ├─ut
|       |  |  |  | | ├─generator
|       |  |  |  | | |     └CodeGenerator.java
├─bin
|  └docker-compose.yml

```
