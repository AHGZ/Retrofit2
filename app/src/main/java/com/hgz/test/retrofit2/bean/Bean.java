package com.hgz.test.retrofit2.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/8.
 */

public class Bean {

    /**
     * error : false
     * results : [{"_id":"59cdbc27421aa972879d121f","content":"<p>各位盆友们，最近老在外面跑来跑去，干货老漏发，求各位理解哇！<\/p>\r\n\r\n<p><img alt=\"\" src=\"https://ws1.sinaimg.cn/large/610dc034ly1fk05lf9f4cj20u011h423.jpg\" /><\/p>\r\n\r\n<h3>iOS<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://github.com/syik/BulletAnalyzer/blob/master/README.md\" target=\"_blank\">弹幕实时分析, 动画, 绘图, 多线程, 长连接, 你想知道的全都有~<\/a>&nbsp;(Zj)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>Android<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://github.com/loopeer/shadow\" target=\"_blank\">灵活的ShadowView，可替代CardView使用<\/a>&nbsp;(None)\r\n\r\n\t<ul>\r\n\t\t<li><a href=\"https://github.com/loopeer/shadow\" target=\"_blank\"><img src=\"http://img.gank.io/5ca55569-7b78-4691-aa1a-a1165eb8a164\" title=\"灵活的ShadowView，可替代CardView使用\" /><\/a><\/li>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"http://rkhcy.github.io/2017/09/21/TransitionNote/\" target=\"_blank\">Android Transition学习笔记<\/a>&nbsp;(HuYounger)\r\n\t<ul>\r\n\t\t<li><a href=\"http://rkhcy.github.io/2017/09/21/TransitionNote/\" target=\"_blank\"><img src=\"http://img.gank.io/a553aa37-9a54-4bb6-bdc2-9bfc2737e065\" title=\"Android Transition学习笔记\" /><\/a><\/li>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://github.com/CN-ZPH/Three360panorama\" target=\"_blank\">Android三种姿势带你玩转360度全景图功能<\/a>&nbsp;(张鹏辉)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://www.github.com/wheat7/NationalGeographic\" target=\"_blank\">比官方更像官方的NationalGeographic国家地理-每日精选客户端，重要的是用了最新的Android Architecture Components(Lifecycle) &amp; Kotlin，给大家探路填坑<\/a>&nbsp;(麦田哥)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>瞎推荐<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://www.diycode.cc/topics/961\" target=\"_blank\">分享下一点创业小心得以及创业项目运营情况<\/a>&nbsp;(None)\r\n\r\n\t<ul>\r\n\t\t<li><a href=\"https://www.diycode.cc/topics/961\" target=\"_blank\"><img src=\"http://img.gank.io/5805649a-9b1e-4841-8b9c-2ca201390489\" title=\"分享下一点创业小心得以及创业项目运营情况\" /><\/a><\/li>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>拓展资源<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://mp.weixin.qq.com/s/gIV6sNhrURn1Qonet26uIA\" target=\"_blank\">讲述了 AI 能做什么，各种算法的商业价值，什么才是真正的 AI 公司<\/a>&nbsp;(jk2K)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>休息视频<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"http://www.bilibili.com/video/av14808728/\" target=\"_blank\">战斗民族日常 best fails 2017. New funny video 2017(720p)<\/a>&nbsp;(LHF)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<p>感谢所有默默付出的编辑们，愿大家有美好一天。<\/p>\r\n","created_at":"2017-09-29T11:21:11.11Z","publishedAt":"2017-09-29T11:20:00.0Z","rand_id":"84cd295b-b1c5-4744-bc47-c78843157847","title":"今日力推：灵活的 ShadowView / 分享下一点创业小心得以及创业项目运营情况","updated_at":"2017-09-29T11:24:58.214Z"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 59cdbc27421aa972879d121f
         * content : <p>各位盆友们，最近老在外面跑来跑去，干货老漏发，求各位理解哇！</p>

         <p><img alt="" src="https://ws1.sinaimg.cn/large/610dc034ly1fk05lf9f4cj20u011h423.jpg" /></p>

         <h3>iOS</h3>

         <ul>
         <li><a href="https://github.com/syik/BulletAnalyzer/blob/master/README.md" target="_blank">弹幕实时分析, 动画, 绘图, 多线程, 长连接, 你想知道的全都有~</a>&nbsp;(Zj)

         <ul>
         </ul>
         </li>
         </ul>

         <h3>Android</h3>

         <ul>
         <li><a href="https://github.com/loopeer/shadow" target="_blank">灵活的ShadowView，可替代CardView使用</a>&nbsp;(None)

         <ul>
         <li><a href="https://github.com/loopeer/shadow" target="_blank"><img src="http://img.gank.io/5ca55569-7b78-4691-aa1a-a1165eb8a164" title="灵活的ShadowView，可替代CardView使用" /></a></li>
         </ul>
         </li>
         <li><a href="http://rkhcy.github.io/2017/09/21/TransitionNote/" target="_blank">Android Transition学习笔记</a>&nbsp;(HuYounger)
         <ul>
         <li><a href="http://rkhcy.github.io/2017/09/21/TransitionNote/" target="_blank"><img src="http://img.gank.io/a553aa37-9a54-4bb6-bdc2-9bfc2737e065" title="Android Transition学习笔记" /></a></li>
         </ul>
         </li>
         <li><a href="https://github.com/CN-ZPH/Three360panorama" target="_blank">Android三种姿势带你玩转360度全景图功能</a>&nbsp;(张鹏辉)
         <ul>
         </ul>
         </li>
         <li><a href="https://www.github.com/wheat7/NationalGeographic" target="_blank">比官方更像官方的NationalGeographic国家地理-每日精选客户端，重要的是用了最新的Android Architecture Components(Lifecycle) &amp; Kotlin，给大家探路填坑</a>&nbsp;(麦田哥)
         <ul>
         </ul>
         </li>
         </ul>

         <h3>瞎推荐</h3>

         <ul>
         <li><a href="https://www.diycode.cc/topics/961" target="_blank">分享下一点创业小心得以及创业项目运营情况</a>&nbsp;(None)

         <ul>
         <li><a href="https://www.diycode.cc/topics/961" target="_blank"><img src="http://img.gank.io/5805649a-9b1e-4841-8b9c-2ca201390489" title="分享下一点创业小心得以及创业项目运营情况" /></a></li>
         </ul>
         </li>
         </ul>

         <h3>拓展资源</h3>

         <ul>
         <li><a href="https://mp.weixin.qq.com/s/gIV6sNhrURn1Qonet26uIA" target="_blank">讲述了 AI 能做什么，各种算法的商业价值，什么才是真正的 AI 公司</a>&nbsp;(jk2K)

         <ul>
         </ul>
         </li>
         </ul>

         <h3>休息视频</h3>

         <ul>
         <li><a href="http://www.bilibili.com/video/av14808728/" target="_blank">战斗民族日常 best fails 2017. New funny video 2017(720p)</a>&nbsp;(LHF)

         <ul>
         </ul>
         </li>
         </ul>

         <p>感谢所有默默付出的编辑们，愿大家有美好一天。</p>

         * created_at : 2017-09-29T11:21:11.11Z
         * publishedAt : 2017-09-29T11:20:00.0Z
         * rand_id : 84cd295b-b1c5-4744-bc47-c78843157847
         * title : 今日力推：灵活的 ShadowView / 分享下一点创业小心得以及创业项目运营情况
         * updated_at : 2017-09-29T11:24:58.214Z
         */

        private String _id;
        private String content;
        private String created_at;
        private String publishedAt;
        private String rand_id;
        private String title;
        private String updated_at;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getRand_id() {
            return rand_id;
        }

        public void setRand_id(String rand_id) {
            this.rand_id = rand_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
