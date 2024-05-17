package kr.co.lotteon.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.lotteon.config.AppInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
public class AppInfoInterceptor implements HandlerInterceptor {

    private final AppInfo appInfo;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        // 모든 요청에 대해 appInfo 모델 참조
        if(modelAndView != null){
            modelAndView.addObject(appInfo);
        }
    }
}
