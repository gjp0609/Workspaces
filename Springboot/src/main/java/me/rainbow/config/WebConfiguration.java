package me.rainbow.config;

///**
// * @author guojinpeng
// * @date 17.11.3 15:42
// */
//@Configuration
//public class WebConfiguration {
//    @Bean
//    public RemoteIpFilter remoteIpFilter() {
//        return new RemoteIpFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean testFilterRegistration() {
//
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new MyFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("MyFilter");
//        registration.setOrder(1);
//        return registration;
//    }
//
//    public class MyFilter implements Filter {
//        @Override
//        public void destroy() {
//        }
//
//        @Override
//        public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain filterChain)
//                throws IOException, ServletException {
//            HttpServletRequest request = (HttpServletRequest) sRequest;
//            System.out.println("this is MyFilter,url :"+request.getRequestURI());
//            filterChain.doFilter(sRequest, sResponse);
//        }
//
//        @Override
//        public void init(FilterConfig arg0) throws ServletException {
//        }
//    }
//}