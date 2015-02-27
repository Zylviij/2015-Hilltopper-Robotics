<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Search.aspx.cs" Inherits="Team1732ScoutingWebForm.TeamSearch" %>
<asp:Content ID="Content1" ContentPlaceHolderID="HeadContent" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="MainContent" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <h2>
        Team Search
    </h2>
    <div id="Team_Info" align="left">
        <asp:Table ID="Team_Match_Info" runat="server" Height="50px" Width="100%" 
            Font-Size="Large">
            <asp:TableRow>
                <asp:TableCell>
                    <asp:Label ID="Label1" runat="server" Text="Team # "></asp:Label><asp:TextBox ID="TextBox1"
                        runat="server" ForeColor="#FF0066"></asp:TextBox></asp:TableCell>
                <asp:TableCell>
                    <asp:Label ID="Label2" runat="server" Text="Match # "></asp:Label><asp:TextBox ID="TextBox2"
                        runat="server" ForeColor="#FF0066"></asp:TextBox></asp:TableCell>
                <asp:TableCell><asp:Button ID="Button1" runat="server" Text="Submit Query" /></asp:TableCell>
            </asp:TableRow>
        </asp:Table>
    </div>
    <div id="db_Output">
        <asp:TextBox ID="dashboardOutput" runat="server" TextMode="MultiLine" Height="300px" Width="100%"></asp:TextBox>
    </div>
</asp:Content>
