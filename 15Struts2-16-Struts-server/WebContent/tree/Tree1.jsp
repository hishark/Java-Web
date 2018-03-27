<%@ page contentType="text/html; charset=utf-8"%>

<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
	<head>
		<sx:head/>
		<script type="text/javascript">
            function treeNodeSelected(arg) {
                alert(arg.source.title + ' selected');
                window.open("ShowResult.action?showResult="+arg.source.title,"","top="+
                		(document.body.clientHeight/2)+",left="+
                		(document.body.clientWidth/2)+",width=420,height=420,toolbar=no"
                		+",status=no,menus=no,resizable=yes,scrollbars=no");
            }
            
            dojo.addOnLoad(function() {                
                var t = dojo.widget.byId('tree');
                var s = t.selector;                
                dojo.event.connect(s, 'select', 'treeNodeSelected');
            });
        </script>
	</head>
	<body>
		<sx:tree id="tree" rootNode="treeNode"
			nodeTitleProperty="name" nodeIdProperty="id"
			childCollectionProperty="children" />
	</body>
</html>