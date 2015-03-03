<%@ Page Title="Dashboard" Language="C#" MasterPageFile="~/Site.master" AutoEventWireup="true"
    CodeBehind="Dashboard.aspx.cs" Inherits="Team1732ScoutingWebForm.About" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <h2>
        Scouting Dashboard
    </h2>
    <div id="Team_Info" align="left">
        <asp:Table ID="Team_Match_Info" runat="server" Height="50px" Width="100%" 
            Font-Size="Large">
            <asp:TableRow>
                <asp:TableCell>
                    <asp:Button runat="server" Text="Update Table" /></asp:TableCell>

            </asp:TableRow>
            <asp:TableRow>
            <asp:TableCell><asp:Label ID="Label1" runat="server" Text="TAKES A LONG TIME - RUN SPARINGLY" Font-Size="Small"></asp:Label></asp:TableCell>
            </asp:TableRow>
        </asp:Table>
    </div>    
</asp:Content>
