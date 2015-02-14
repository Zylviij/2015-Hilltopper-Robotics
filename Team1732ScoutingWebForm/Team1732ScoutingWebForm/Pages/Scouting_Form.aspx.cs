using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Team1732ScoutingWebForm
{
    public partial class _Default : System.Web.UI.Page
    {


        protected void enableMoarStacks_CheckedChanged(object sender, EventArgs e)
        {
            toteStacksSixPlus.Visible = true;
            Response.Redirect("http://localhost:3401/Pages/Scouting_Form.aspx");
        }
    }
}
