package top.wonderheng.chatroom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
//使用Springboot内嵌的tomcat启动websocket
/**
 * 服务器节点
 *
 * 如果使用独立的servlet容器，而不是直接使用springboot的内置容器，就不要注入ServerEndpointExporter，因为它将由容器自己提供和管理
 * @return
 */
@Component  //普通组件  添加ServerEndpointExporter配置bean
public class WebSocketConfig {
    @Bean      //建bean  ServerEndpointExporter
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}

