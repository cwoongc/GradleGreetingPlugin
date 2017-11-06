그래들 플러그인 포탈 https://plugins.gradle.org/ 에 커스텀 플러그인을 만들어서 등록해보는 프로젝트.
그래들 문서의 기본 샘플 플러그인인 greeting을 커스텀플러그인으로 따라만들어서  jar로 만들고 이를 그래들 플러그인 포털에 등록해주는 
그래들 플러그인 퍼블리싱 플러그인 (https://plugins.gradle.org/docs/publish-plugin)을 이용해서 등록해본다.
그래들 플러그인 퍼블리싱 플러그인은 적용되면 login, publishPlugins라는 task를 제공한다.
login task를 통해 지금 컴퓨터가 그래들 플러그인 퍼블리시 할수 있도록 하고,
publishPlugins task를 통해 그래들 플러그인 포탈에 커스텀 플러그인을 퍼블리싱하면, 
그래들 엔지니어들 확인후 24시간이내에 그래들 포털계정에  연결된 이메일로 연락을 준다.
자세한 플러그인 포탈 퍼블리싱 프로세스는 https://plugins.gradle.org/docs/submit 를 찹고한다.

